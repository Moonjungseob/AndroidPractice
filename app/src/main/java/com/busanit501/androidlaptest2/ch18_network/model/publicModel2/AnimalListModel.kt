package com.busanit501.androidlaptest2.ch18_network.model.publicModel2

//{
//    "getPetAnimalInfo": {
//    "header": {
//    "resultCode": "00",
//    "resultMsg": "NORMAL_CODE"
//},
//    "body": {
//    "items": {
//    "item": [
//    {
//        "sj": "2024-07-09 08시경 명장동 경동 104동 부근 푸들강아지",
//        "wrter": "문성현",
//        "writngDe": "2024-07-09",
//        "cn": "2024-07-09 08시경 명장동 경동 104동 8,9라인 부근 푸들강아지 경비원 신고 접수로 인한 포획 후 센터 보관",
//        "ty3Date": "08시 20분 경",
//        "ty3Place": "명장동 경동 104동 8,9라인",
//        "ty3Kind": "개(푸들)",
//        "ty3Sex": "미상",
//        "ty3Process": "보호 중",
//        "ty3Ingye": "",
//        "ty3Insu": "",
//        "ty3Picture": "http://www.busan.go.kr/comm/getImage?srvcId=BBSTY3&upperNo=1635173&fileTy=ATTACH&fileNo=1&thumbTy=M"
//    },
class AnimalListModel (
    val getPetAnimalInfo: GetPetAnimalInfo
)

class GetPetAnimalInfo (
    val body: Body
)

class Body (
    val items: Items
)

class Items (
    val item: List<AnimalModel>
)

class AnimalModel {
    var sj: String? = null
    var wrter: String? = null
//    var writngDe: String? = null
//    var cn: String? = null
//    var ty3Date: String? = null
    var ty3Place: String? = null
//    var ty3Kind: String? = null
//    var ty3Sex: String? = null
//    var ty3Process: String? = null
//    var ty3Ingye: String? = null
//    var ty3Insu: String? = null
    var ty3Picture: String? = null
}




