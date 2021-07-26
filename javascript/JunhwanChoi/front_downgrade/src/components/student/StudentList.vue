<template>
    <div>
        <h3>목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="50">학생번호</th>
                <th align="center" width="150">이름</th>
                <th align="center" width="300">성적</th>
            </tr>
            <tr v-if="!students || (Array.isArray(students) && students.length === 0)">
                <td colspan="3">
                    생성이 안됩니다! 삭제하십시오!
                </td>
            </tr>
            <tr v-else v-for="(student, idx) in students" :key="idx">
                <td align="center">{{ student.studentNo }}</td>
                <td align="center" v-on:click="measureStudentGrade(student.studentGrade, $event)">
                    {{ student.name }}
                </td>
                <td align="center">{{ student.grade }}</td>
            </tr>
        </table>
    </div>
</template>

<script>
import EventBus from '@/eventBus.js'
export default {
    name: 'StudentList',
    props: {
        students: {
            type: Array
        }
    },
    methods: {
        measureStudentGrade(studentGrade, $event) {
            const payload = [ studentGrade, $event.target.innerHTML ]
            EventBus.$emit('measureStudentGrade', payload)
        }
    }
}
</script>