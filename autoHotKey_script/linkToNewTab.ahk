;��ڂ̃L�[�Ƀ`���_�i ~ �j������΁A���̃L�[�͖��������ꂸ���ʂɓ��͂����B
;��ɂ��Ă����΁A�ق��̃z�b�g�L�[�ł�~�w�肳��Ă��Ȃ��Ă�����������Ȃ��Ȃ�B 

#IfWinActive ahk_class IEFrame
  ~RButton & LButton::
    Send,{RButton}
    sleep 100
    Send,w
  ;~RButton & LButton::MsgBox,�E�N���b�N���Ȃ��獶�N���b�N
#IfWinActive

#IfWinActive ahk_class MozillaWindowClass
  ~RButton & LButton::
    Send,{RButton}
    sleep 100
    Send,t
  ;~RButton & LButton::MsgBox,�E�N���b�N���Ȃ��獶�N���b�N
#IfWinActive

return