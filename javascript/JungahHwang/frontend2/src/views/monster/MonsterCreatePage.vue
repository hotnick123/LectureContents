<template>
  <div align="center">
    <h2>몬스터 생성</h2>
    <monster-create @submit="onSubmit"/>
  </div>
</template>


<script>
import axios from "axios"
import MonsterCreate from '@/components/monster/MonsterCreate'

export default {
  name: 'MonsterCreatePage',
  components: {
    MonsterCreate
  },
  methods: {
    onSubmit (payload) {
      const { name, hp, exp, money } = payload

      axios.post('http://localhost:7777/monster/create', { name, hp, exp, money }).then(() => {
        alert('몬스터가 등록되었습니다')
      }).catch(res => {
        alert(res.response.data.message)
      })
    }
  }

}
</script>