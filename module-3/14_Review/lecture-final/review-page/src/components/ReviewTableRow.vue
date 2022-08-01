<template>
  <tr>
    <td>{{ review.title }}</td>
    <td nowrap>{{ review.reviewer }}</td>
    <td>{{ review.review }}</td>
    <td class="stars">
      <img
        src="../assets/star.png"
        v-bind:title="review.rating + ' Star Review'"
        class="star"
        v-for="n in review.rating"
        v-bind:key="n"
        width="20px"
      />
    </td>
    <td>
      <input
        type="checkbox"
        v-bind:checked="review.done"
        v-on:change="onFavoritedChange(review)"
      />
    </td>
  </tr>
</template>

<script>
export default {
  name: "ReviewTableRow",
  props: ["review"],
  methods: {
    onFavoritedChange() {
      this.$store.commit("FLIP_FAVORITED", this.review);
    },
  },
};
</script>

<style scoped>
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