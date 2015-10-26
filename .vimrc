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
" bundleで管理するディレクトリを指定
set runtimepath+=~/.vim/bundle/neobundle.vim/
 
" Required:
call neobundle#begin(expand('~/.vim/bundle/'))
 
" neobundle自体をneobundleで管理
NeoBundleFetch 'Shougo/neobundle.vim'
 
" 追加のプラグイン

" NERDTree
NeoBundle 'scrooloose/nerdtree'
 
" vim/ruby
"NeoBundle "vim-ruby/vim-ruby"

call neobundle#end()
 
" Required:
filetype plugin indent on
 
" 未インストールのプラグインがある場合、インストールするかどうかを尋ねてくれるようにする設定
NeoBundleCheck
 
"-------------------------
" End Neobundle Settings.
"-------------------------
