<template>
  <div class="add-book">
    <h1>Add a New Book</h1>
    <new-book-form></new-book-form>
  </div>
</template>

<script>
import NewBookForm from "@/components/NewBookForm.vue";

export default {
  components: { NewBookForm },
};
</script>

<style lang="scss" scoped>
</style>