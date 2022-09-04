.class public Lcom/fimi/soul/module/dronemanage/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/dronemanage/c$a;
    }
.end annotation


# static fields
.field private static a:Lcom/fimi/soul/module/dronemanage/c;


# instance fields
.field private b:Lcom/fimi/soul/module/dronemanage/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/fimi/soul/module/dronemanage/c;->a:Lcom/fimi/soul/module/dronemanage/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/fimi/soul/module/dronemanage/c$a;->b:Lcom/fimi/soul/module/dronemanage/c$a;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/c;->b:Lcom/fimi/soul/module/dronemanage/c$a;

    return-void
.end method

.method public static a()Lcom/fimi/soul/module/dronemanage/c;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/dronemanage/c;->a:Lcom/fimi/soul/module/dronemanage/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/dronemanage/c;

    invoke-direct {v0}, Lcom/fimi/soul/module/dronemanage/c;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/dronemanage/c;->a:Lcom/fimi/soul/module/dronemanage/c;

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/dronemanage/c;->a:Lcom/fimi/soul/module/dronemanage/c;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/module/dronemanage/c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/dronemanage/c;->b:Lcom/fimi/soul/module/dronemanage/c$a;

    return-void
.end method

.method public b()Lcom/fimi/soul/module/dronemanage/c$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/c;->b:Lcom/fimi/soul/module/dronemanage/c$a;

    return-object v0
.end method
