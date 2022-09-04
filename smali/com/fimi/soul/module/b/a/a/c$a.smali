.class Lcom/fimi/soul/module/b/a/a/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/b/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fimi/soul/module/b/a/a/c$b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/b/a/a/c$a;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/fimi/soul/module/b/a/a/c$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/c$a;-><init>()V

    return-void
.end method
