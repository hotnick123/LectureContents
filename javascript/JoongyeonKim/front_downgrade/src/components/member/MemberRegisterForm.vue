<template>
    <form @submit.prevent="onSubmit">
       <h2>회원가입</h2>
        <table>
            <tr>
                <td>이름</td>
                <td><input type="text" v-model="name"></td>
            </tr>
            <tr>
                <td>아이디</td>
                <td><input type="text" v-model="id"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="text" v-model="pw"></td>
            </tr>
        </table>
        <div>
            <button type="submit">회원가입</button>
            <router-link :to="{ name: 'MemberListPage' }">
                취소
            </router-link>
        </div>
    </form>
</template>

<script>
export default {
    name: 'MemberRegisterForm',
    data () {
        return {
            name: '이름을 작성하세요',
            id: '',
            pw: ''
        }
    },
    methods: {
        onSubmit () {
            const { name, id, pw } = this
            this.$emit('submit', { name, id, pw })
        }
    }
}
</script> 