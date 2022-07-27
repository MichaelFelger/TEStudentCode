<template>
  <div class="main">
    <h2>Product Review for {{ name }}</h2>
    <p class="description">{{ description }}</p>

    <!-- comment -->

    <div class="well-display">
      <div class="well">
        <span class="amount">{{ averageRating }}</span>
        Average Rating
      </div>
      <div class="well" v-for="n in 5" v-bind:key="n">
        <span class="amount">{{ numberOfStarsForRating(n) }}</span>
        {{ n }} Star Reviews
      </div>
    </div>

    <div
      class="review"
      v-bind:class="{ favorite: review.favorite === true }"
      v-for="review in reviews"
      v-bind:key="review.id"
    >
      <h4>{{ review.reviewer }}</h4>
      <div class="rating">
        <img
          src="../assets/star.png"
          v-bind:title="review.rating + ' Star Reviews'"
          v-for="n in review.rating"
          v-bind:key="n"
          class="ratingStar"
        />
      </div>
      <h3>{{ review.title }}</h3>
      <p>{{ review.review }}</p>
      <p>
        Favorite?
        <input type="checkbox" v-model="review.favorite" />
      </p>
    </div>
  </div>
</template>

<script>
export default {
  // comment
  name: "product-review",
  data() {
    return {
      name: "Cigar Parties for Dummies",
      description:
        "Host and plan the perfect cigar party for all of your friends.",
      reviews: [
        {
          id: 1,
          reviewer: "Malcolm Gladwell",
          title: "What a book!",
          review:
            "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language.",
          rating: 3,
          favorite: false,
        },
        {
          id: 2,
          reviewer: "mike",
          title: "awesome read!",
          review: "used candy cigars",
          rating: 5,
          favorite: false,
        },
      ],
    };
  },
  computed: {
    averageRating() {
      let sum = this.reviews.reduce((acc, review) => acc + review.rating, 0);
      return sum / this.reviews.length;
    },
    numberofOneStarReviews() {
      let oneStarReviews = this.reviews.filter((r) => r.rating === 1);
      return oneStarReviews.length;
    },
    numberofTwoStarReviews() {
      return this.reviews.filter((r) => r.rating === 2).length;
    },
  },
  methods: {
    numberOfStarsForRating(rating) {
      return this.reviews.filter((r) => r.rating === rating).length;
    },
  },
};
</script>

<style scoped>
div.main {
  margin: 1rem 0;
}

div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}

div.main div.review div.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

div.main div.review div.rating img {
  height: 100%;
}

div.main div.review p {
  margin: 20px;
}

div.main div.review h3 {
  display: inline-block;
}

div.main div.review h4 {
  font-size: 1rem;
}

div.main div.review.favorite {
  background-color: lightyellow;
}
</style>