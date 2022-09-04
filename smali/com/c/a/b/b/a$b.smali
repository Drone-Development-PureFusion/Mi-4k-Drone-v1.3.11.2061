.class public Lcom/c/a/b/b/a$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/c/a/b/a/e;

.field public final b:Lcom/c/a/b/b/a$a;


# direct methods
.method protected constructor <init>(Lcom/c/a/b/a/e;Lcom/c/a/b/b/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/c/a/b/b/a$b;->a:Lcom/c/a/b/a/e;

    iput-object p2, p0, Lcom/c/a/b/b/a$b;->b:Lcom/c/a/b/b/a$a;

    return-void
.end method
