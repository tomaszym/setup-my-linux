(git)
(sbt)
(yaourt)
(spotify)
(zsh) + .zshrc

// oh my zsh:
sh -c "$(curl -fsSL https://raw.githubusercontent.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"


chmod 400 ~/.ssh/id_rsa
ssh-add ~/.ssh/id_rsa 

mkdir ~/git
(git clone ...)

git clone https://github.com/asdf-vm/asdf.git ~/.asdf --branch v0.5.0
echo -e '\n. $HOME/.asdf/asdf.sh' >> ~/.zshrc
echo -e '\n. $HOME/.asdf/completions/asdf.bash' >> ~/.zshrc
