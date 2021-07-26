<template>
    <form @submit.prevent="onSubmit">
        <h3>삼각형 정보 입력</h3>
        <table>
            <tr>
                <td>밑변</td>
                <td><input type="number" v-model="triangleWidth"></td>
            </tr>  
            <tr>
                <td>밑변</td>
                <td><input type="number" v-model="triangleHeight"></td>
            </tr>
        </table>

        <div>
            <button type="submit">등록</button>
            <router-link :to="{ name: 'Home' }">
                돌아가기
            </router-link>
        </div>

        <div class="home">
        <h2>테스트 페이지</h2>
        <div id="app">

            <b>넓이: {{ this.$store.getters.AreaFromSpring }}</b><br>
            <input type="button" @click="getArea()" value="area"/><br>
        </div>
    </div>
    </form>
</template>

<script>

import {mapActions} from 'vuex'

export default {
    name: 'Quiz89RegisterForm',
    data () {
        return {
            triangleWidth: '',
            triangleHeight: '',
            triangleArea: ''            
        }
    },
    methods: {
        ...mapActions ([
            'generateGetArea'
        ]),
        plus () {
            this.value++
        },
        getArea () {
            this.generateGetArea()
        }
    }
}
</script> 