;一つ目のキーにチルダ（ ~ ）をつければ、そのキーは無効化されず普通に入力される。
;一つにつけておけば、ほかのホットキーでは~指定されていなくても無効化されなくなる。 

#IfWinActive ahk_class IEFrame
  ~RButton & LButton::
    Send,{RButton}
    sleep 100
    Send,w
  ;~RButton & LButton::MsgBox,右クリックしながら左クリック
#IfWinActive

#IfWinActive ahk_class MozillaWindowClass
  ~RButton & LButton::
    Send,{RButton}
    sleep 100
    Send,t
  ;~RButton & LButton::MsgBox,右クリックしながら左クリック
#IfWinActive

return