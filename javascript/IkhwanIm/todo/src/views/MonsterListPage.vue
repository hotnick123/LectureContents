<template>
  <div id="monster">
    <h2>Vue + Spring + DB 몬스터 목록</h2>
    <router-link :to="{ name: 'MonsterRegisterPage' }">
      몬스터 등록
    </router-link>
    <monster-lists :monsters="monsters"/>
  </div>
</template>

<script>
import MonsterLists from "../components/monster/MonsterLists";
import { mapState, mapActions } from 'vuex'
export default {
  name: 'MonsterListPage',
  components: {
    MonsterLists
  },
  computed: {
    ...mapState(['monsters'])
  },
  mounted () {
    this.fetchMonsterList()
  },
  methods: {
    ...mapActions(['fetchMonsterList'])
  }
}
</script>