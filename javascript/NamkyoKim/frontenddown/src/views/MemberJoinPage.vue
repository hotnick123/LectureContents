<template>
    <div align="center">
        <h2>회원가입</h2>
        <board-register-form @submit="onSubmit"/>
    </div>
</template>


<script>
import MemberRegisterForm from '@/components/member/MemberRegisterForm.vue'
import axios from 'axios'
export default {
    name: 'MemberJoinPage',
    components: {
        MemberRegisterForm
    },
    methods: {
        onSubmit (payload) {
            const { name, id, pw, } = payload
            axios.post('http://localhost:7777/vuemember/join', { name, id, pw })
                    .then(res => {
                        alert('회원가입 성공! - ' + res)
                    
                    })
                    .catch(res => {
                        alert(res.response.data.message)
                    })
        }
    }
}
</script> 