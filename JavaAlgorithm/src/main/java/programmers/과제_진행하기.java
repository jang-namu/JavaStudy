package programmers.lv2;

public class 과제_진행하기 {
    public static void main(String[] args) {

    }
}



/*
# python code
# plan은 최대 10만 1440까지 갈 수 있다.

def solution(plans):
    answer = []
    jobs = []

    for plan in plans:
        starts = list(map(int, plan[1].split(":")))
        start = starts[0] * 60 + starts[1]
        jobs.append([plan[0], start, int(plan[2])])

    jobs.sort(key=lambda x: x[1])
    jobs.append(["", 999999, 999999])   # 최대 plans 배열 길이 * playtime = 10만

    print(jobs)
    st = []

    for i, job in enumerate(jobs[:-1]):
        current = job[1] + job[2]   # st에 있는 job의 시간을 업데이트 하기 위해, 현재 작업의 종료시간으로 초기화.
        if current < jobs[i+1][1]:
            answer.append(job[0])


            while st:
                now = st.pop()
                if current + now[2] < jobs[i+1][1]:
                    answer.append(now[0])
                    current += now[2]
                    continue
                elif current + now[2] == jobs[i+1][1]:
                    answer.append(now[0])

                else:
                    now[2] -= jobs[i+1][1] - current
                   # now[1] = jobs[i+1][1]
                    st.append(now)
                break

        elif current == jobs[i+1][1]:
            answer.append(job[0])

        else:
            job[2] -= jobs[i+1][1] - job[1]
            #job[1] = jobs[i+1][1]
            st.append(job)

    return answer


 */