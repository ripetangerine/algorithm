function solution(board, moves) {
    var answer = 0; //사라진 인형의 개수
    let stack = [];
    
    for(let x of moves){
        let currentMove = x-1;
        
        let i;
        // 순회하면서 해당 칸의 숫자를 찾았다면 빠져나오기
        for(i=0; i<board.length; i++){
            if(0 !== board[i][currentMove]){
                break;
            }
        }
        // 
        if(i < board.length){
            if(stack[stack.length-1] === board[i][currentMove]){
                console.log(`pop : ${board[i][currentMove]}`)
                board[i][currentMove] = 0;
                answer ++;
                stack.pop();
            }
            else{
                console.log(`push : ${board[i][currentMove]}`)
                stack.push(Number(board[i][currentMove]));
                board[i][currentMove] = 0;
            }
            
        }
    }
    
    console.log(stack)
    return answer*2;
}