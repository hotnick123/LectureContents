<template>
  <div align="center">
    <h2>게시물 작성</h2>
    <board-register-form @submit="onSubmit"></board-register-form>
  </div>
</template>


<script>
import axios from 'axios'

import BoardRegisterForm from '../components/board/BoardRegisterForm.vue'

export default {
  name: 'BoardRegisterPage',
  components: {
    BoardRegisterForm
  },
  methods: {
    onSubmit (payload) {
      const { title, writer, content } = payload
      axios.post('http://localhost:7777/vueboard/register', { title, writer, content }).then(res => {
        alert('등록성공!' + res)
        // this.$router.push({
        //   name: 'BoardReadPage',
        //   params: { boardNo: res.data.boardNo.toString() }
        // })
      }).catch(res => {
        alert(res.response.data.message)
      })
    }
  }
}
</script>