<template>
<table>
    <form @submit.prevent="onSubmit">
        <div>
            <tr>
            <td>아이디</td>
            <td><input type="text" v-model="id"></td>
            <td>비밀번호</td>
            <td><input id="password" type="pw" v-model="pw"></td>
            </tr>
            <tr>
            <td>이름</td>
            <td><input type="text" v-model="name"></td>
                    </tr>
                <button type="submit">회원가입</button>
            <router-link :to="{ name: 'MemberListPage' }">
                        취소
            </router-link>
                </div>
            </form>
    </table>
</template>

<script>
export default {
    name: 'MemberRegisterForm',
    data () {
        return {
            name: '',
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
