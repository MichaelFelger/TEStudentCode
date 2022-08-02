<template>
  <div>
    <form class="new-book-form">
      <label for="title">Title:</label>
      <input
        id="title"
        class="title-input"
        type="text"
        v-model="newBook.title"
      />
      <label for="author">Author:</label>
      <input
        id="author"
        class="author-input"
        type="text"
        v-model="newBook.author"
      />
      <label for="isbn">ISBN:</label>
      <input
        id="isbn"
        class="isbn-input"
        type="number"
        v-model="newBook.isbn"
      />
      <button type="submit" @click.prevent="addNewBook">Save Book</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "new-book-form",
  data() {
    return {
      newBook: {},
    };
  },
  methods: {
    addNewBook() {
      this.$store.commit("ADD_BOOK", this.newBook);
      this.resetForm();
    },
    resetForm() {
      this.newBook = {};
    },
  },
};
</script>




