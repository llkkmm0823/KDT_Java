function user(){
    let user_value = document.getElementById('user').value
    let size = user_value.length //글자수 
    let mid = ''
    if(size < 5){
        mid = '5글자보다 아이디는 더 커야합니다.'
    }else{
        mid = '5글자이상이므로 사용 가능합니다.'
    }
    result.innerHTML = mid
}
function check(){
    let pw1_value = document.getElementById('pw1').value
    let pw2_value = document.getElementById('pw2').value

    let mid = ''
    if(pw1_value == pw2_value){
        mid = '일치!!' + "<img src='yes.jpg'>"
    }else{
        mid = '불일치!!' + "<img src='no.png'>"
    }

    result.innerHTML = mid
}