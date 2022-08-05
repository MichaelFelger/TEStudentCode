<template>
  <div>
    <div class="header">
      <div>
        <div v-if="!isTitleEdit">
          <h1>{{ title }}</h1>
          <button @click="isTitleEdit = true">Edit</button>
        </div>
        <div v-if="isTitleEdit">
          <input type="text" v-model="newTitle" />
          <button @click="updateTitle">Save</button>
          <button @click="isTitleEdit = false">Cancel</button>
        </div>
      </div>
      <router-link
        tag="button"
        class="btn addNewCard"
        :to="{ name: 'AddCard', params: { boardID: this.boardId } }"
        v-if="!isLoading"
        >Add New Card</router-link
      >
      <button
        class="btn btn-cancel deleteBoard"
        v-if="!isLoading"
        v-on:click="deleteBoard"
      >
        Delete Board
      </button>
    </div>
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div v-else>
      <div class="status-message error" v-show="errorMsg !== ''">
        {{ errorMsg }}
      </div>
      <div class="boards">
        <board-column
          title="Planned"
          :cards="planned"
          :boardID="this.boardId"
        />
        <board-column
          title="In Progress"
          :cards="inProgress"
          :boardID="this.boardId"
        />
        <board-column
          title="Completed"
          :cards="completed"
          :boardID="this.boardId"
        />
      </div>
    </div>
  </div>
</template>

<script>
import boardsService from "../services/BoardService";
import BoardColumn from "@/components/BoardColumn";

export default {
  name: "cards-list",
  components: {
    BoardColumn,
  },
  props: {
    boardId: {
      type: Number,
      default: 0,
    },
  },
  data() {
    return {
      title: "",
      newTitle: "",
      isLoading: true,
      errorMsg: "",
      isTitleEdit: false,
    };
  },
  methods: {
    retrieveCards() {
      boardsService
        .getCards(this.boardId)
        .then((response) => {
          this.title = response.data.title;
          this.$store.commit("SET_BOARD_CARDS", response.data.cards);
          this.isLoading = false;
        })
        .catch((error) => {
          if (error.response && error.response.status === 404) {
            alert(
              "Board cards not available. This board may have been deleted or you have entered an invalid board ID."
            );
            this.$router.push({ name: "Home" });
          }
        });
    },
    deleteBoard() {
      if (!confirm("are you sure that you want to remove this board?")) {
        return;
      }

      // delete board here
      boardsService
        .deleteBoard(this.boardId)
        .then((response) => {
          if (response.status === 200) {
            alert("board was removed");
            this.$store.commit("DELETE_BOARD", this.boardId);
            this.$router.push({ name: "Home" });
          }
        })
        .catch((err) => {
          if (err.response) {
            this.errorMsg = "error deleting board: " + err.response.statusText;
          } else if (err.request) {
            this.errorMsg = "error deleting board: server could not be reached";
          } else {
            this.errorMsg = "error deleting board. it's nate's fault";
          }
        });
    },
    updateTitle() {
      this.title = this.newTitle;

      const board = this.board;
      const updatedBoard = {
        id: board.id,
        title: this.newTitle,
        backgroundColor: board.backgroundColor,
      };

      boardsService.updateBoard(updatedBoard).then((r) => {
        if (r.status === 200) {
          this.$store.commit("UPDATE_BOARD", updatedBoard);
          this.isTitleEdit = false;
        }
      });
    },
  },
  created() {
    this.retrieveCards();
  },
  computed: {
    planned() {
      return this.$store.state.boardCards.filter(
        (card) => card.status === "Planned"
      );
    },
    inProgress() {
      return this.$store.state.boardCards.filter(
        (card) => card.status === "In Progress"
      );
    },
    completed() {
      return this.$store.state.boardCards.filter(
        (card) => card.status === "Completed"
      );
    },
    board() {
      return this.$store.state.boards.find((b) => b.id == this.boardId);
    },
  },
};
</script>

<style>
.boards {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 20px;
}
.board-actions {
  text-align: center;
  padding: 20px 0;
}
.board-actions a:link,
.board-actions a:visited {
  color: blue;
  text-decoration: none;
}
.board-actions a:hover {
  text-decoration: underline;
}
.btn.addNewCard {
  color: #fff;
  background-color: #508ca8;
  border-color: #508ca8;
}
.header {
  display: flex;
  align-items: center;
}
.header h1 {
  flex-grow: 1;
}
</style>
