<template>
  <div>
    <h1 class="book-title">{{ getBookByISBN.title }}</h1>
    <h3 class="book-author">{{ getBookByISBN.author }}</h3>
    <img
      v-if="getBookByISBN.isbn"
      v-bind:src="
        'http://covers.openlibrary.org/b/isbn/' + getBookByISBN.isbn + '-M.jpg'
      "
    />
    <p v-if="!getBookByISBN.read">I have not read this book</p>
    <p v-if="getBookByISBN.read">I have read this book</p>
  </div>
</template>

<script>
export default {
  props: ["getBookByISBN"],
};
</script>

<style scoped>
</style>