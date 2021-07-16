<template>
    <div align="center">
        <h2>회원가입</h2>
        <member-register-form @submit="onSignUp"/>
    </div>
</template>

<script>

import MemberRegisterForm from '@/components/member/MemberRegisterForm.vue'
import axios from 'axios'


export default {
    name: 'MemberRegisterPage',
    components: {
        MemberRegisterForm
    },
    methods: {
        onSignUp (payload) {
            const { id, pw } = payload
            axios.post('http://localhost:7777/vuemember/register', { id, pw })
                .then(res => {
                    alert('회원가입이 완료되었습니다.' + res)
                })
                .catch(res => {
                    alert(res.response.data.message)
                })
        }
    }
}

</script>