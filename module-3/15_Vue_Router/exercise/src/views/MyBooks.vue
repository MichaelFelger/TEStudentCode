<template>
  <div class="reading-list">
    <h1>Reading List</h1>
    <reading-list></reading-list>
    <router-link v-bind:to="{ name: 'add-book' }"
      >Add Book to Reading List</router-link
    >
  </div>
</template>

<script>
import ReadingList from "@/components/ReadingList.vue";

export default {
  components: { ReadingList },
};
</script>

<style lang="scss" scoped>
</style>