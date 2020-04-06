<template>
  <div>
      On affiche isConnected : {{ isConnected }}
    <br/>
    Et le message : {{ getMessage }}
    <br>
<!--    <form @submit.prevent="handleSubmit">-->
<!--      <input type="text" placeholder="message"-->
<!--             v-model="message"-->
<!--             ref="ingredientInput">-->
<!--      <div class="button-wrapper">-->
<!--        <button  type="submit" class="search-icon">-->
<!--          bouton-->
<!--        </button>-->
<!--      </div>-->
<!--    </form>-->
    <input type="text" v-model="message"/>
    <button @click="emitEvent">emit</button>
    <div>{{response}}</div>
  </div>
</template>

<script>
import { mapGetters } from 'vuex';

export default {
  name: 'Recap',
  data() {
    return {
      message: '',
      response: 'No response yet',
    };
  },
  computed: {
    ...mapGetters([
      'isConnected',
      'getMessage',
    ]),
  },
  methods: {
    emitEvent() {
    },
  },
};
</script>

<style>

</style>
