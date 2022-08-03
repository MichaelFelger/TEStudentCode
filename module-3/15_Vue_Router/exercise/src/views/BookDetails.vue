<template>
  <div class="book-details">
    <book-details v-bind:getBookByISBN="getBookByISBN"></book-details>
  </div>
</template>

<script>
import BookDetails from "@/components/BookDetails.vue";

export default {
  components: { BookDetails },
  computed: {
    getBookByISBN() {
      const selectedISBN = this.$route.params.isbn;
      return this.$store.state.books.find((b) => b.isbn === selectedISBN);
    },
  },
};
</script>

<style scoped>
</style>