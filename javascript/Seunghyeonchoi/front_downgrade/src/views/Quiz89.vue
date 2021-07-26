<template>
    <div align="center">
        <h2>삼각형 넓이 계산</h2>
        <quiz89-register-form @submit="onSubmit"/>
    </div>


</template>

<script>
import Quiz89RegisterForm from '@/components/quiz/Quiz89RegisterForm.vue'
import axios from 'axios'
export default {
    name: 'Quiz89RegisterPage',
    components: {
        Quiz89RegisterForm
    },
    methods: {
        onSubmit (payload) {
            const {  triangleWidth, triangleHeight  } = payload
            axios.post('http://localhost:7777/vuequiz/calcTriangleArea', {  triangleWidth, triangleHeight  })
                    .then(res => {
                        alert('전송 성공 - ' + res)
                        // console.log('console.log :  ' + res.data.monsterNo.toString())
                        this.$router.push({
                            name: 'Quiz89ResultPage'
                            // params: { boardNo: res.data.boardNo.toString() }
                        })
                    })
                    .catch(res => {
                        alert(res.response.data.message)
                    })
        }
    }
}
</script> 

