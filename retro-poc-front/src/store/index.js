import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    socket: {
      isConnected: false,
      message: 'Pas de message',
      error: false,
    },
  },
  getters: {
    isConnected: (state) => state.socket.isConnected,
    getMessage: (state) => state.socket.message,
  },
});
