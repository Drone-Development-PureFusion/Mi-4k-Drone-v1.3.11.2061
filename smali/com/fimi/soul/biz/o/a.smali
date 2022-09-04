.class public Lcom/fimi/soul/biz/o/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/o/a$a;
    }
.end annotation


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/o/a;->a:Z

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/o/a;
    .locals 1

    invoke-static {}, Lcom/fimi/soul/biz/o/a$a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/biz/o/a;->a:Z

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/biz/o/a;->a:Z

    return v0
.end method
