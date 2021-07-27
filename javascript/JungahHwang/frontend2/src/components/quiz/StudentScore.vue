<template>
  <div>
    <table border="1">
      <tr>
        <td>번호</td>
        <td>이름</td>
        <td>점수</td>
      </tr>
       <tr v-if="!students || (Array.isArray(students) && students.length === 0)">
        <td colspan="3">
          학생 점수가 없습니다
        </td>
      </tr>
      <tr v-else v-for="(student, idx) in students" :key="idx"
          v-on:click="sendScore(student.score)">
        <td align="center">{{ student.studentNo }}</td>
        <td align="center">{{ student.name }}</td>
        <td align="center">{{ student.score }}</td>
      </tr>
    </table>
  </div>
</template>


<script>
import EventBus from '@/eventBus'

export default {
  name: 'StudentScore', 
  props: {
    students: {
      type: Array
    }
  },
   methods: {
    sendScore(inscore) {
      const payload = inscore
      EventBus.$emit('sendscore', payload)
    }
  },
}
</script>


<style scoped>
table {
  margin: auto;
}
</style>