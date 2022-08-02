<template>
  <div class="products">
    <h1>Products</h1>
    <prod-list></prod-list>
  </div>
</template>

<script>
import ProdList from "@/components/ProductsList.vue";
export default {
  components: {
    ProdList,
  },
};
</script>

<style scoped>
</style>