<template>
  <div id="app" class="main">
    <h1>{{ product.name }}</h1>
    <p class="description">{{ product.description }}</p>
    <div class="actions">
      <router-link :to="{ name: 'products' }">Back to Products</router-link>
      <span> | </span>
      <router-link :to="{ name: 'add-review', params: { id: product.id } }"
        >Add Review</router-link
      >
    </div>
    <div class="well-display">
      <average-summary />
      <star-summary rating="1" />
      <star-summary rating="2" />
      <star-summary rating="3" />
      <star-summary rating="4" />
      <star-summary rating="5" />
    </div>
    <review-list />
  </div>
</template>

<script>
import AverageSummary from "@/components/AverageSummary";
import StarSummary from "@/components/StarSummary";
import ReviewList from "@/components/ReviewList";

export default {
  name: "product-details",
  components: {
    AverageSummary,
    StarSummary,
    ReviewList,
  },
  created() {
    const selectedProductID = this.$route.params.id;
    this.$store.commit("SET_ACTIVE_PRODUCT", parseInt(selectedProductID));
  },
  computed: {
    product() {
      const selectedProductID = this.$store.state.activeProduct;
      return this.$store.state.products.find((p) => p.id === selectedProductID);
    },
  },
};
</script>

<style scoped>
</style>