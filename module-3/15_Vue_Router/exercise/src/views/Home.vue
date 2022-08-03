<template>
  <div class="home">
    <h1>Home</h1>
    <best-seller-list></best-seller-list>
    <new-releases-list></new-releases-list>
  </div>
</template>

<script>
import BestSellerList from "@/components/BestSellerList.vue";
import NewReleasesList from "@/components/NewReleasesList.vue";

export default {
  components: { NewReleasesList, BestSellerList },
};
</script>

<style lang="scss" scoped
>
</style>