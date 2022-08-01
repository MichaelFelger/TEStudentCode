<template>
  <div class="well" v-bind:class="{ filter: selectedFilter }">
    <span class="amount" v-on:click="updateFilter()">{{
      numberOfReviews
    }}</span>
    {{ rating }} Star Review{{ numberOfReviews === 1 ? "" : "s" }}
  </div>
</template>

<script>
export default {
  name: "star-summary",
  props: ["rating"],
  methods: {
    updateFilter() {
      this.$store.commit("UPDATE_FILTER", parseInt(this.rating));
    },
  },
  computed: {
    numberOfReviews() {
      const reviews = this.$store.state.reviews;
      return reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === parseInt(this.rating) ? 1 : 0);
      }, 0);
    },
    selectedFilter() {
      return this.$store.state.filter == this.rating;
    },
  },
};
</script>
 
 <style>
.filter {
  background-color: hotpink;
}
</style>
