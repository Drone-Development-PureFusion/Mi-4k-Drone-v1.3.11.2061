.class Lcom/fimi/soul/biz/j/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/j/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field static final a:Lcom/fimi/soul/biz/j/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/biz/j/d;

    invoke-direct {v0}, Lcom/fimi/soul/biz/j/d;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/j/d$a;->a:Lcom/fimi/soul/biz/j/d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
