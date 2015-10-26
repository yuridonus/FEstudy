set nu
set nobackup
set undodir=D:/tool/vim74-kaoriya-win64/undo

" statusline setting
set laststatus=2
set statusline=%F%m%r%h%w\%=[TYPE=%Y]\[FORMAT=%{&ff}]\[ENC=%{&fileencoding}]\[LOW=%l/%L]

" ^ and $ keys are too far
nnoremap <Space>h  ^
nnoremap <Space>l  $

" ignore auto newline
set formatoptions=q

" ignore risky keymap
nnoremap ZZ <Nop>
nnoremap ZQ <Nop>

" jk
inoremap jk <Esc>

"---------------------------
" Start Neobundle Settings.
"---------------------------
" bundle�ŊǗ�����f�B���N�g�����w��
set runtimepath+=~/.vim/bundle/neobundle.vim/
 
" Required:
call neobundle#begin(expand('~/.vim/bundle/'))
 
" neobundle���̂�neobundle�ŊǗ�
NeoBundleFetch 'Shougo/neobundle.vim'
 
" �ǉ��̃v���O�C��

" NERDTree
NeoBundle 'scrooloose/nerdtree'
 
" vim/ruby
"NeoBundle "vim-ruby/vim-ruby"

call neobundle#end()
 
" Required:
filetype plugin indent on
 
" ���C���X�g�[���̃v���O�C��������ꍇ�A�C���X�g�[�����邩�ǂ�����q�˂Ă����悤�ɂ���ݒ�
NeoBundleCheck
 
"-------------------------
" End Neobundle Settings.
"-------------------------
