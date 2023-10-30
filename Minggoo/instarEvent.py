import requests
from bs4 import BeautifulSoup
import random

#파이썬으로 작성해보려했는데 크롤링이 안되어서 엑셀로함 ㅠㅠ
#파이썬 이클립스로 작성 가능. .py로 파일 생성하기

# 인스타그램 게시물 URL
instagram_url = 'https://www.instagram.com/p/CyIgWpnRilY/'

# 게시물 페이지를 가져옵니다
response = requests.get(instagram_url)
soup = BeautifulSoup(response.text, 'html.parser')

# 댓글 아이디를 저장할 리스트
comment_ids = []

# 댓글을 찾아서 아이디를 추출합니다
comments = soup.find_all('a', {'class': 'sqdOP yWX7d _8A5w5 ZIAjV'})
for comment in comments:
    comment_id = comment.text
    if comment_id not in comment_ids:
        comment_ids.append(comment_id)

# 추출된 아이디 중에서 2명을 랜덤으로 선택합니다
if len(comment_ids) >= 2:
    random_ids = random.sample(comment_ids, 2)
    # 선택된 아이디를 출력합니다
    for idx, user_id in enumerate(random_ids, start=1):
        print(f'랜덤으로 선택된 아이디 {idx}: {user_id}')
else:
    print("댓글 아이디가 2개 이상 필요합니다.")
