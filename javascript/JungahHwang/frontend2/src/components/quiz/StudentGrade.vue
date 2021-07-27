<template>
  <div>
    <ul>
      <li v-if="scores >= 62.5">
        평균 이상입니다.
      </li>
      <li v-if="scores <= 62.5">
        평균 이하입니다.
      </li>
    </ul>
  </div>
</template>


<script>

import EventBus from '@/eventBus'

export default {
  data () {
    return {
      scores: '',

    }
  },
  created () {
    EventBus.$on('sendscore', (payload) => {
      this.scores = payload
    })
  }
}
</script>
