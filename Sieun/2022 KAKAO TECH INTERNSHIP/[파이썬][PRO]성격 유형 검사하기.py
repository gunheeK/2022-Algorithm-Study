def solution(survey, choices):
    
    answer = ''
    
    score = {
        'R' : 0, 'T' : 0,
        'C' : 0, 'F' : 0,
        'J' : 0, 'M' : 0,
        'A' : 0, 'N' : 0
    }
    
    for i in range(len(survey)):
        negative = survey[i][0]
        positive = survey[i][1]
                
        if choices[i] == 1: 
            score[negative] += 3   # 매우 비동의
        elif choices[i] == 2:
            score[negative] += 2   # 비동의
        elif choices[i] == 3:
            score[negative] += 1   # 약간 비동의
        elif choices[i] == 4:
            pass                   # 모르겠음
        elif choices[i] == 5:
            score[positive] += 1   # 약간 동의
        elif choices[i] == 6:
            score[positive] += 2   # 동의
        elif choices[i] == 7:
            score[positive] += 3   # 매우 동의
        
    if score['R'] >= score['T']:
        answer += 'R'
    else:
        answer += 'T'

    if score['C'] >= score['F']:
        answer += 'C'
    else:
        answer += 'F' 

    if score['J'] >= score['M']:
        answer += 'J'
    else:
        answer += 'M'

    if score['A'] >= score['N']:
        answer += 'A'
    else:
        answer += 'N'
            
    return answer