<template>
  <table>
    <thead>
      <tr>
        <th>Title</th>
        <th>Reviewer</th>
        <th>Review</th>
        <th>Rating</th>
        <th>Favorited</th>
      </tr>
    </thead>
    <tbody>
      <review-table-row
        v-for="review in filteredReviews"
        v-bind:key="review.title"
        :review="review"
      />
      <tr v-show="filteredReviews.length == 0">
        <td colspan="5">There are no reviews of this rating</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
import ReviewTableRow from "./ReviewTableRow.vue";

export default {
  name: "review-table",
  components: {
    ReviewTableRow,
  },
  computed: {
    filteredReviews() {
      return this.$store.getters.filteredReviews;
    },
  },
};
</script>

<style style="scoped">
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}
.stars {
  display: flex;
}
</style>
