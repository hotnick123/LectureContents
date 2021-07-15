<template>
  <div id="board">
    <h2>Vue + Spring 게시판</h2>
    <router-link :to="{ name: 'BoardRegisterPage'}">
      게시물 작성
    </router-link>
  </div>
</template>


<script>


export default {
  name: 'BoardListPage',
  components: {

  },
  computed: {
    
  }

}
</script>
