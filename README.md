


1. 회원가입 시 입력한 member의 이메일이 중복되지 않도록 검증해야 한다. 입력된 이메일을 이미 사용중인 회원이 존재하면 에러 메세지를 뷰에 넘긴다.
  1-1)  MemberService & MemberRepository의 findByEmail 메서드를 완성해주세요. 
  1-2)  MemberService의 join 메서드를 수정해주세요.  ( 1-1에서 만든 findByEmail을 이용하면 편할 것 같습니다. 추가 메서드를 작성해서 join에서 호출해도 무관합니다!) 
  2-2)  MemberService의 join 메서드에 검증실패 시  “이미 존재하는 이메일 계정입니다.” 에러 메세지를 발생시키는 코드를 작성해주세요. (throw new 활용)

          
2. 로그인 시 {회원이메일,비밀번호} 를 검증해야 하고, 비밀번호가 틀렸을 시 에러 메세지를 뷰에 넘긴다.
  2-1)  MemberSerivce의 validateMember 메서드를 수정해주세요 (1-1에서 만든 findByEmail을 이용하면 편할 것 같습니다)        
  2-2)  MemberService의 validateMember 메서드에 검증실패 시  “이메일 또는 비밀번호를 확인해주세요.” 에러 메세지를 발생시키는 코드를 작성해주세요. (throw new 활용)


제출기한 ~4/20 00시 까지 (토->일 넘어가는 자정입니다)
