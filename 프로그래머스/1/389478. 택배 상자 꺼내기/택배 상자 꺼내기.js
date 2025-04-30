function solution(n, w, num) {
    var answer = 0;
    
    //할당
    let BoxArray = [];
    // let col = (n/w)%10==0? n/w : n/w + 1;
    let countForN = 1;

    for(let i=0; i<n/w; i++){
        let arr = []
        for(let j=0; j<w; j++){
                if(countForN<=n) arr.push(countForN++)
                else arr.push(0)
        }
        if(i%2==1) arr.reverse()
        BoxArray.push(arr);
    }
    // BoxArray.reverse();
    // console.log(BoxArray)
    
    //2. 뽑아오기
    //해당 값의 열값을 저장 후 그 이후의 유효한 열값을 셈
    
    //location of target
    let targetCol,targetRow;
    for(let i=0; i<n/w; i++){
        // console.log(BoxArray[i].indexOf(num)); //4
        if(BoxArray[i][BoxArray[i].indexOf(num)] !== undefined){
            targetCol = BoxArray[i].indexOf(num);
            targetRow = i;
        }
    }

    for(let i=targetRow; i<n/w; i++){
        if(BoxArray[i][targetCol] !== 0){
            answer+=1;
        }
    }
    
    return answer;
}
