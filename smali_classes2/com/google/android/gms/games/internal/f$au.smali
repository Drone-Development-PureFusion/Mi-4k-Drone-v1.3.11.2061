.class public interface abstract Lcom/google/android/gms/games/internal/f$au;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "au"
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "status"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "suggested_gamer_tags"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/f$au;->a:[Ljava/lang/String;

    return-void
.end method
