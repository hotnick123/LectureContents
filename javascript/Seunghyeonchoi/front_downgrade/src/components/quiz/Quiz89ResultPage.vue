<template>
    <div>
        <br>
        <h3>몬스터 목록</h3>
        <br>
        <table border="1">
            <tr>
                <th align="center" width="100">넓이</th>
            </tr>
            <tr v-if="!triangleAreas || (Array.isArray(triangleAreas) && triangleAreas.length === 0)">
                <td colspan="7">
                    현재 등록된 몬스터가 없습니다!
                </td>
            </tr>
            <tr v-else v-for="triangleArea in triangleAreas" :key="triangleArea.monsterNo">
                <td align="center">{{ quiz89.triangleArea }}</td>
            </tr>
        </table>
    </div>
</template>

<script>
export default {
    name: 'QuizResultPage',
    props: {
        monsters: {
            type: String
        }
    },
    methods: {
        ...mapActions ([
            'generateGetArea'
        ]),
        plus () {
            this.value++
        },
        randomNumber () {
            this.generateGetArea()
        }
    }
}
</script>



<!-- HTML 요소 파트 작성 - Vue랑 연결 시킬 형식으로 작성해도 무방 -->
<template>

</template>

<!-- javascript 관련 파트 작성 -->
<script>
import Vue from 'vue'
import GlobalComponent from '../components/GlobalComponent.vue'
import LocalComponent from '../components/LocalComponent.vue'

import { mapActions } from 'vuex'

// import { mapActions } from 'vuex'
Vue.component(GlobalComponent.name, GlobalComponent)
export default {
    components: {
        'local-component': LocalComponent
    },
    data () {
        return {
            counter: 0,
            value: 0,
            msg: 'Vue 객체 데이터'
        }
    },
    methods: {
        ...mapActions ([
            'generateRandomNumber'
        ]),
        plus () {
            this.value++
        },
        randomNumber () {
            this.generateRandomNumber()
        }
    }
}
</script>