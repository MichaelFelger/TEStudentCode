<template>
  <div>
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div v-else>
      <h1>{{ card.title }}</h1>
      <p>{{ card.description }}</p>
      <comments-list :comments="card.comments" />
      <div class="board-actions">
        <router-link
          :to="{ name: 'Board', params: { id: this.$route.params.boardID } }"
          >Back to Board</router-link
        >
      </div>
    </div>
  </div>
</template>

<script>
import boardService from "@/services/BoardService";
import CommentsList from "@/components/CommentsList";

export default {
  name: "card-detail",
  data() {
    return {
      isLoading: true,
      card: {
        title: "",
        description: "",
        status: "",
        comments: [],
      },
    };
  },
  components: {
    CommentsList,
  },
  created() {
    const boardID = this.$route.params.boardID;
    const cardID = this.$route.params.cardID;

    boardService.getCard(boardID, cardID).then((card) => {
      this.card = card;
      this.isLoading = false;
    });
  },
};
</script>
