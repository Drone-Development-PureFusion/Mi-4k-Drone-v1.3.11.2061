.class Lcom/fimi/soul/module/c/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static a:Lcom/fimi/soul/module/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/module/c/b;

    invoke-direct {v0}, Lcom/fimi/soul/module/c/b;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/c/b$a;->a:Lcom/fimi/soul/module/c/b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/fimi/soul/module/c/b;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/c/b$a;->a:Lcom/fimi/soul/module/c/b;

    return-object v0
.end method
