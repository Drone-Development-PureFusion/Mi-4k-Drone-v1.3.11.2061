.class Lcom/fimi/soul/biz/k/g$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/k/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/fimi/soul/biz/k/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/biz/k/g;

    invoke-direct {v0}, Lcom/fimi/soul/biz/k/g;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/k/g$a;->a:Lcom/fimi/soul/biz/k/g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/fimi/soul/biz/k/g;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/k/g$a;->a:Lcom/fimi/soul/biz/k/g;

    return-object v0
.end method
