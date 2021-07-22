<template>
  <div align="center">
    <h2>몬스터 변조</h2>
    <monster-modify-form v-if="monster" :monster="monster" @submit="onSubmit"/>
    <p v-else>로딩중 .......</p>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
import axios from 'axios'
import MonsterModifyForm from "../components/monster/MonsterModifyForm";

export default {
  name: 'MonsterModifyPage',
  components: {
    MonsterModifyForm,
  },
  props: {
    monsterNo: {
      type: String,
      required: true
    }
  },
  computed: {
    ...mapState(['monster'])
  },
  methods: {
    ...mapActions(['fetchMonster']),
    onSubmit (payload) {
      const { monster_name, hp, exp, money } = payload
      axios.put(`http://localhost:7777/vuemonster/${this.monsterNo}`, { monster_name, hp, exp, money })
          .then(res => {
            alert('수정 성공!')
            this.$router.push({
              name: 'MonsterReadPage',
              params: { monsterNo: res.data.monsterNo.toString() }
            })
          })
          .catch(err => {
            alert(err.response.data.message)
          })
    }
  },
  created () {
    this.fetchMonster(this.monsterNo)
        .catch(err => {
          alert(err.response.data.message)
          this.$router.back()
        })
  }
}
</script>