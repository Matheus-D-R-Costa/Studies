package edu.dio.aulas.arvorebinaria;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void post(T content) {
        BinaryNode<T> newBinaryNode = new BinaryNode<>(content);
        root = post(root, newBinaryNode);
    }

    private BinaryNode<T> post(BinaryNode<T> currentBinaryNode, BinaryNode<T> newBinaryNode) {
        if (currentBinaryNode == null) {
            return newBinaryNode;
        } else if (newBinaryNode.getContent().compareTo(currentBinaryNode.getContent()) < 0) {
            currentBinaryNode.setLeftNode(post(currentBinaryNode.getLeftNode(), newBinaryNode));
        } else {
            currentBinaryNode.setRightNode(post(currentBinaryNode.getRightNode(), newBinaryNode));
        }

        return currentBinaryNode;

    }

    public void showInOrder() {
        System.out.println("\n Exibindo InOrder");
        showInOrder(this.root);
    }

    private void showInOrder(BinaryNode<T> currentBinaryNode) {
        if (currentBinaryNode != null) {
            showInOrder(currentBinaryNode.getLeftNode());
            System.out.println(currentBinaryNode.getContent() + ", ");
            showInOrder(currentBinaryNode.getRightNode());
        }
    }

    public void showPostOrder() {
        System.out.println("\n Exibindo PostOrder");
        showPostOrder(this.root);
    }

    private void showPostOrder(BinaryNode<T> currentBinaryNode) {
        if (currentBinaryNode != null) {
            showPostOrder(currentBinaryNode.getLeftNode());
            showPostOrder(currentBinaryNode.getRightNode());
            System.out.println(currentBinaryNode.getContent() + ", ");
        }
    }

    public void showPreOrder() {
        System.out.println("\n Exibindo PreOrder");
        showPreOrder(this.root);
    }

    private void showPreOrder(BinaryNode<T> currentBinaryNode) {
        if (currentBinaryNode != null) {
            System.out.println(currentBinaryNode.getContent() + ", ");
            showPreOrder(currentBinaryNode.getLeftNode());
            showPreOrder(currentBinaryNode.getRightNode());
        }
    }

    public void remove(T content) {
        try {

            BinaryNode<T> currentBinaryNode = this.root;
            BinaryNode<T> fatherBinaryNode = null;
            BinaryNode<T> sonBinaryNode = null;
            BinaryNode<T> temporaryBinaryNode = null;

            while (currentBinaryNode != null && !currentBinaryNode.getContent().equals(content)) {
                fatherBinaryNode = currentBinaryNode;

                if (content.compareTo(currentBinaryNode.getContent()) < 0) {
                    currentBinaryNode = currentBinaryNode.getLeftNode();
                } else {
                    currentBinaryNode = currentBinaryNode.getRightNode();
                }
            }

            if (currentBinaryNode == null) {
                System.out.println("Conteudo nao existente. Bloco try");
            }

            if (fatherBinaryNode == null) {
                if (currentBinaryNode.getRightNode() == null) {
                    this.root = currentBinaryNode.getLeftNode();
                } else if (currentBinaryNode.getLeftNode() == null) {
                    this.root = currentBinaryNode.getRightNode();
                } else {
                    for (temporaryBinaryNode = currentBinaryNode, sonBinaryNode = currentBinaryNode.getLeftNode();
                         sonBinaryNode.getRightNode() != null;
                         temporaryBinaryNode = sonBinaryNode, sonBinaryNode = sonBinaryNode.getLeftNode()
                    ) {
                        if (sonBinaryNode != currentBinaryNode.getLeftNode()) {
                            temporaryBinaryNode.setRightNode(sonBinaryNode.getLeftNode());
                            sonBinaryNode.setLeftNode(root.getLeftNode());
                        }
                    }

                    sonBinaryNode.setRightNode(root.getRightNode());
                    root = sonBinaryNode;

                }
            } else if (currentBinaryNode.getRightNode() == null) {
                if (fatherBinaryNode.getLeftNode() == currentBinaryNode) {
                    fatherBinaryNode.setLeftNode(currentBinaryNode.getLeftNode());
                } else {
                    fatherBinaryNode.setRightNode(currentBinaryNode.getLeftNode());
                }
            } else if (currentBinaryNode.getLeftNode() == null) {
                if (fatherBinaryNode.getLeftNode() == currentBinaryNode) {
                    fatherBinaryNode.setLeftNode(currentBinaryNode.getRightNode());
                } else {
                    fatherBinaryNode.setRightNode(currentBinaryNode.getRightNode());
                }
            } else {
                for (
                        temporaryBinaryNode = currentBinaryNode, sonBinaryNode = currentBinaryNode.getLeftNode();
                        sonBinaryNode.getRightNode() != null;
                        temporaryBinaryNode = sonBinaryNode, sonBinaryNode = sonBinaryNode.getRightNode()
                ) {
                    if (sonBinaryNode != currentBinaryNode.getLeftNode()) {
                        temporaryBinaryNode.setRightNode(sonBinaryNode.getLeftNode());
                        sonBinaryNode.setLeftNode(currentBinaryNode.getLeftNode());
                    }

                    sonBinaryNode.setRightNode(currentBinaryNode.getRightNode());

                    if (fatherBinaryNode.getLeftNode() == currentBinaryNode) {
                        fatherBinaryNode.setLeftNode(sonBinaryNode);
                    } else {
                        fatherBinaryNode.setRightNode(sonBinaryNode);
                    }
                }
            }

        } catch (NullPointerException error) {
            System.out.println("Conteudo nao existente. Bloco catch");
        }

    }

}
