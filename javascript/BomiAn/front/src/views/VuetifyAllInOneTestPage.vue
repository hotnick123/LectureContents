<template>
  <div>
    <p class="blue lighten-5 red--text">Test</p>
    <p class="blue white--text">Test</p>
    <p class="blue darken-3">Test</p>
    <v-btn class="teal" rounded @click="roundBtnClick">ROUND 버튼</v-btn>
    <v-btn class="indigo white--text">기본 버튼 </v-btn>
    <v-btn class="teal" dark>
      <v-icon>bluetooth</v-icon>
      <span>bluetooth</span>
    </v-btn>
    <v-btn fab color="orange" dark>
      <v-icon>bluetooth</v-icon>
    </v-btn>
      
      <v-container fluid>
        <v-layout row wrap>
          <v-flex xs12 md6 class="primary white--text">
            <div>{{ message }}</div>
          </v-flex>
          <v-flex xs4 md2 class="green white--text">
            <div>{{ message }}</div>
          </v-flex>
          <v-flex xs4 md2 class="green white--text">
            <div>{{ message }}</div>
          </v-flex>
          <v-flex xs4 md2 class="green white--text">
            <div>{{ message }}</div>
          </v-flex>
        </v-layout>
      </v-container>

      <v-layout row justify-center>
        <v-dialog v-model="dialog" persistent max-width="400">
          <template v-slot:activator="{ on }">
            <v-btn color="primary" dark v-on="on">결제</v-btn>
          </template>
          <v-card>
            <v-card-title class="headline">
              {{ service.name }}
            </v-card-title>
            <v-card-text>
              5성급 호텔이 30% 할인 <{{ service.name }}> 상품을 결제하시겠습니까?
            </v-card-text>
            <v-card-actions>
              <v-spacer></v-spacer>
              <v-btn color="teal darken-1" text @click.native="btn_click($event)">
                취소
              </v-btn>
              <v-btn color="teal darken-1" text @click.native="btn_click($event)">
                결제승인
              </v-btn>
            </v-card-actions>
          </v-card>
        </v-dialog>
      </v-layout>
  </div>
</template>

<script>
export default {
  data() {
    return {
      dialog: false,
      message: '환장',
      service: {name: '7박 8일 여행 코스'}
    }
  },
  methods: {
    roundBtnClick () {
      alert('Vuetify 버튼이라고 들어봤니?')
    },
    btn_click ($event) {
      if($event.target.innerText == "결제승인") {
        alert('결제가 완료되었습니다!')
        this.dialog = false
      } else{ 
        alert('결제를 취소합니다.')
        this.dialog = false
      }
    }
  },
}
</script>

<style>
* {
}
h1 {
  margin: 10px;

}
p {
  padding: 10px;
  margin: 5px 10px;
}
</style>