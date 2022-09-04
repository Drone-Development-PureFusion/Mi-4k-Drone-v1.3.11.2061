.class Lcom/fimi/soul/utils/y$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/utils/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/String;

.field public static d:Ljava/lang/String;

.field public static e:Ljava/lang/String;

.field public static f:Ljava/lang/String;

.field public static g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "fly_mode_log_tb"

    sput-object v0, Lcom/fimi/soul/utils/y$a;->a:Ljava/lang/String;

    const-string v0, "userID"

    sput-object v0, Lcom/fimi/soul/utils/y$a;->b:Ljava/lang/String;

    const-string v0, "fcVersion"

    sput-object v0, Lcom/fimi/soul/utils/y$a;->c:Ljava/lang/String;

    const-string v0, "openType"

    sput-object v0, Lcom/fimi/soul/utils/y$a;->d:Ljava/lang/String;

    const-string v0, "applyTime"

    sput-object v0, Lcom/fimi/soul/utils/y$a;->e:Ljava/lang/String;

    const-string v0, "x2Version"

    sput-object v0, Lcom/fimi/soul/utils/y$a;->f:Ljava/lang/String;

    const-string v0, "appType"

    sput-object v0, Lcom/fimi/soul/utils/y$a;->g:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
