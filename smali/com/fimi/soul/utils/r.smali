.class public final enum Lcom/fimi/soul/utils/r;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/fimi/soul/utils/r;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lcom/fimi/soul/utils/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/fimi/soul/utils/r;

    sput-object v0, Lcom/fimi/soul/utils/r;->a:[Lcom/fimi/soul/utils/r;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fimi/soul/utils/r;
    .locals 1

    const-class v0, Lcom/fimi/soul/utils/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/utils/r;

    return-object v0
.end method

.method public static values()[Lcom/fimi/soul/utils/r;
    .locals 1

    sget-object v0, Lcom/fimi/soul/utils/r;->a:[Lcom/fimi/soul/utils/r;

    invoke-virtual {v0}, [Lcom/fimi/soul/utils/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fimi/soul/utils/r;

    return-object v0
.end method
